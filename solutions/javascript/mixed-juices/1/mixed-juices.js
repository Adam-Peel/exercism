// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  switch (name) {
    case 'Pure Strawberry Joy':
      return 0.5;
      break;
    case 'Energizer':
      return 1.5;
      break;
    case 'Green Garden':
      return 1.5;
      break;
    case 'Tropical Island':
      return 3;
      break;
    case 'All or Nothing':
      return 5;
      break;
    default:
      return 2.5
  }
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  let wedges = wedgesNeeded;
  let count = 0;
  let i =0;
  
  while (i < limes.length && wedges > 0) {
 
    if (limes[i] === 'large') {
      count ++;
      wedges -= 10;
      
    } else if (limes[i] === 'medium') {
      count ++;
      wedges -= 8;
    }
    else {
      count ++;
      wedges -= 6}
  i++
  }


  return count;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
let remaining = timeLeft; 
let drinks = [...orders]

for ( let i = 0; i < orders.length; i++) {
    
    if (remaining > 0)
    {
    remaining -= timeToMixJuice(orders[i]);
    drinks.shift(); 
    } else {
      return drinks
    }
  
  }

  return drinks
}
