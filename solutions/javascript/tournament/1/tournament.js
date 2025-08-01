//
// This is only a SKELETON file for the 'Tournament' exercise. It's been provided as a
// convenience to get you started writing code faster.
//
export const tournamentTally = (resultList) => {
  let template = "Team                           | MP |  W |  D |  L |  P";

  if (!resultList || resultList.length < 1) {
    return template;
  }

  const results = resultList.split("\n");
  let finalObj = {};
  let templateObj = { played: 0, win: 0, draw: 0, loss: 0, points: 0 };

  results.forEach((result) => {
    const game = result.split(";");
    console.log(game);

    if (!finalObj.hasOwnProperty(game[0])) {
      finalObj[game[0]] = { ...templateObj };
    }
    if (!finalObj.hasOwnProperty(game[1])) {
      finalObj[game[1]] = { ...templateObj };
    }

    finalObj[game[0]].played++;
    finalObj[game[1]].played++;

    if (game[2] === "draw") {
      finalObj[game[0]].draw++;
      finalObj[game[0]].points++;
      finalObj[game[1]].draw++;
      finalObj[game[1]].points++;
    } else if (game[2] === "win") {
      finalObj[game[0]].win++;
      finalObj[game[1]].loss++;
      finalObj[game[0]].points += 3;
    } else if (game[2] === "loss") {
      finalObj[game[1]].win++;
      finalObj[game[0]].loss++;
      finalObj[game[1]].points += 3;
    }
  });

  console.log(finalObj);
  // Sort here before creating template:
  let sortedArray = Object.entries(finalObj).sort((a, b) => {
    if (b[1].points !== a[1].points) {
      return b[1].points - a[1].points;
    }
    return a[0].localeCompare(b[0]);
  });

  console.log(sortedArray);

  let sortedObject = Object.fromEntries(sortedArray);
  console.log(sortedObject);

  for (let [key, value] of Object.entries(sortedObject)) {
    console.log(key);
    console.log(value.played);
    template +=
      `\n` +
      `${key.padEnd(31, " ")}` +
      "|" +
      `${String(value.played).padStart(3, " ")}` +
      " |" +
      `${String(value.win).padStart(3, " ")}` +
      " |" +
      `${String(value.draw).padStart(3, " ")}` +
      " |" +
      `${String(value.loss).padStart(3, " ")}` +
      " |" +
      `${String(value.points).padStart(3, " ")}`;
  }

  console.log(template);
  return template;
};
