// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  let str1 = String(array1).replaceAll(",", "")
  let str2 = String(array2).replaceAll(",", "")

  return Number(str1) + Number (str2)
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  const number = String(value)
  const check = number
  if (number.split("").reverse().join("") == check) {
    return true
  } else {
    return false
  }
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!input || input.length <1 ) {
    return "Required field"
  } else if(Number(input) && Number(input) !== 0) {
    return ""
  } else {
    return "Must be a number besides 0"
  }
}
