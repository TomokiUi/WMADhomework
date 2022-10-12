// Q1

function printStars(n) {
  let item = "";
  for (let i = 0; i <= n ; i++) { 
    for (let j = i; j < n ; j++) {
      item = item + "*";  
  }
  item = item + "\n";
}
    console.log(item);
}


printStars(5);


// function printStars(n) {
//   let item = "";
//   for (let i = 0; i <= n ; i++) {
//       item = item + "*";
//       console.log(item); 
//   }
// for (let i = 0; i <= n ; i++) { 
//   for (let j = i; j < n ; j++) {
//     item = item + "*";  
// }
// item = item + "\n";
// }
//   console.log(item);
// }
// printStars(5);

// Q2

// i and j
// j < i

function printStars(n) {
  let item = "";
  for (let i = 0; i <= n ; i++) {
      item = item + "*";
      console.log(item); 
  }
  for (let j = n; j > 0 ; j--) {
    item = item - "*";  
    
    console.log(item);
}
}

printStars(5);

// Q3

function hollowTraiangle(n) {
  for (let i = 0 ; i <= n ; i ++) {
    for (let j = i; j < n ; j++) {
      
    }
  }
}