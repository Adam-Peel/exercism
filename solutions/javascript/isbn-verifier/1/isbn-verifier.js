//
// This is only a SKELETON file for the 'ISBN Verifier' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isValid = (isbn) => {
  const noDashes = isbn.replaceAll('-', "");

  if (noDashes.length !== 10){
    return false;
  }

  const regex = /[0-9xX]/gi
  if (!regex.test(noDashes)){
    return false;
  } 

  if (noDashes.includes("X") && noDashes.indexOf("X") !== 9)
  {
    return false
  }
  
  const noDashesArray = noDashes.split("");

  let count = 0  
  
  for (let i = 0, j= 10; i < noDashesArray.length; i++, j--)
  {
      if(noDashesArray[i] === "x" || noDashes[i] === "X"){
        count += (10 * j)
      }
else {
    count += (noDashes[i] * j)
    }
  };

  if (count % 11 == 0){
    return true
  } else {
    return false
  }
};
