
// amswer
// Q1***********************************

function increasingList(array) {
  let j;
  for (let i = 0; i < array.length; i++) {
    j = i + 1;
    if (array[i] > array[j]){
      return false;
    }
  }
  return true;
}

let assendingList = ([20, 40, 50, 80, 100, 200]);
console.log(increasingList(assendingList));



function decreasingList(array) {
  let j;
  for (let i = 0; i < array.length; i++) {
    j = i + 1
    if (array[i] < array[j]){
      return false;
    }
  }
  return true;
}
let decendingList = ([6, 5, 4, 3, 2, 1]);
console.log(decreasingList(decendingList));



// ***************************Q2



function duplicatesArrayInSorted(array) {
  for (let i = 0 ; i < array.length; i++) {
    if (array[i] === array[i+1]) {
      return array[i];
    }
  }
}
let nums = [ 2, 10, 12, 12, 40, 50];
console.log(duplicatesArrayInSorted(nums));


// *****************Q3

let numberList = [9, 10, 2, 300, -10, 9];

function duplicatesInAnArray(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length ; j++) {
      if (array[i] === array[j]) {
        return true;
      }
    }
  }
  return false;
}

console.log(duplicatesInAnArray(numberList));


// function sortedList(array, target) {
//   let low;
//   let high = low + 1;
//   for (let low = 0 ; low <= n ; i--)
// if (low <= high){
//   return true;
// }

// }

// let sortedArray = [20, 40, 50, 80, 100, 200];



// function binarySearch(array, target) {

//     let low = 0;
//     let high = array.length - 1;
//     // let mid 

//     while (high >= low) {
//         let mid = Math.floor((low + high) / 2);

//         if (target === array[mid]) {
//             return mid;
//         }

//         if (target > array[mid]) {
//             low = mid + 1;
//         } else {
//             high = mid - 1;
//         }

//     }

// }