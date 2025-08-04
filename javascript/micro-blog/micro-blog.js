//
// This is only a SKELETON file for the 'Micro-blog' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

// export const truncate = (input) => {
//   const iterator = input[Symbol.iterator]();
//   let nextChar = iterator.next();
//   let str = "";
//   let count = 0;

//   while (!nextChar.done && count < 5) {
//     str += nextChar.value;
//     nextChar = iterator.next();
//     count++;
//   }
//   return str;
// };

export function createVisitor(name, age, ticketId) {
  return {
    name,
    age,
    ticketId,
  };
}

/**
 * Revokes a ticket for a visitor.
 *
 * @param {Visitor} visitor the visitor with an active ticket
 * @returns {Visitor} the visitor without a ticket
 */
export function revokeTicket(visitor) {
  visitor.ticketId = null;
  return visitor;
}

/**
 * Determines the status a ticket has in the ticket tracking object.
 *
 * @param {Record<string, string|null>} tickets
 * @param {string} ticketId
 * @returns {string} ticket status
 */
export function ticketStatus(tickets, ticketId) {
  const returnString = "unknown ticket id";
  for (const [key, value] of Object.entries(tickets)) {
    if (key === ticketId && value !== null) {
      returnString = `sold to ${key}`;
    } else if (key === ticketId && value === null) {
      returnString = "not sold";
    }
  }
  return returnString;
}

/**
 * Determines the status a ticket has in the ticket tracking object
 * and returns a simplified status message.
 *
 * @param {Record<string, string|null>} tickets
 * @param {string} ticketId
 * @returns {string} ticket status
 */
export function simpleTicketStatus(tickets, ticketId) {
  for (const [key, value] of Object.entries(tickets)) {
    if (key === ticketId && value !== null) {
      return key;
    } else {
      return "invalid ticket !!!";
    }
  }
}
/**
 * Determines the version of the GTC that was signed by the visitor.
 *
 * @param {VisitorWithGtc} visitor
 * @returns {string | undefined} version
 */
export function gtcVersion(visitor) {
  for (const [key, value] of Object.entries(visitor)) {
    if (key === "gtc") {
      return value.version;
    } else {
      return undefined;
    }
  }
}
