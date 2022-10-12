// Q1

let number1 = 10;
let number2 = 20;

if (number1 > number2) {
  console.log(number1);
} else {
  console.log(number2);
}

// Q2

for (let i = 1; i <= n ; i++) {
  if( ( i % 2 ) == 0 ) {
    console.log(i);
  }
}

// Q3



// Question3***********************



let studentsScores = [
  {
      studentName : "Akito",
      subjectA: 100,
      subjectB: 95,
      subjectC: 80,
      subjectD: 90
  }, 
  {
      studentName: "Yuki",
      subjectA: 100,
      subjectB: 95,
      subjectC: 80,
      subjectD: 90
  },
  {
      studentName: "Hikaru",
      subjectA: 100,
      subjectB: 95,
      subjectC: 80,
      subjectD: 90
  },
  {
      studentName: "Tomoki",
      subjectA: 100,
      subjectB: 95,
      subjectC: 80,
      subjectD: 90
  }
]

if ((studentsScores.subjectA + studentsScores.subjectB + studentsScores.subjectC + studentsScores.subjectD) / 4 > 90) {
  console.log(studentsScores.studentName() + "grade A");
}
else if (90 >= (studentsScores.subjectA + studentsScores.subjectB + studentsScores.subjectC + studentsScores.subjectD) / 4 > 70) {
  console.log(studentsScores.studentName + "grade B");
}
else if (70 >= (studentsScores.subjectA + studentsScores.subjectB + studentsScores.subjectC + studentsScores.subjectD) / 4 > 50) {
  console.log(studentsScores.studentName + "grade C");
}
else {
  console.log(studentsScores.studentName + "grade F");
}

