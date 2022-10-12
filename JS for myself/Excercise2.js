// Q1

function printOddNumbers(n) {
  for (let i = 0; i <= n; i++ ) {
    if (i % 2 == 1) {
        console.log(i, " is an odd number");
    }
}
}
printOddNumbers(30);




  // Q2

  let numList = 0;
  function sumOfElements(array) {
    for (let i = 0; i < array.length; i++) {
      numList = numList + array[i];
    }
    console.log(numList);
    }

    sumOfElements([1, 2, 3, 4, 5, 6]); 


    // Q3



      function largestNumber(array) {
        let i = 0
        for (let j = 1; j <= array.length; j++) {
          if (i > j) {
            console.log(i);
          } else{
            console.log(j);
          }
        }
      }

      largestNumber(["40", "50", "20", "2"]);




