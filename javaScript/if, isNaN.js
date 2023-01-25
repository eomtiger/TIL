// 조건문을 알아보자

//parseInt()는 파이썬의 int()와 비슷함
//prompt는 예전에 쓰던 alert 기능


const age = parseInt(prompt('how old are u?'));

//isNaN()은 숫자인지 아닌지 판별
console.log(isNaN(age));


if(isNaN(age)){
  console.log('please write number')
} else{
  console.log('ok')
}

//조건문
//소괄호 안의 값이 true이면 {} 안을 실행
// 아니면 else 뒤의 {} 안을 실행
//if (){

//} else{

//}