# Function

파이썬과 함수 기능은 다를 바가 없다.

다만 함수 정의 문법은 다르다.

```js
function plus(A, B) {
    console.log(A+B);
}


plus(3, 8)
// 11
```



## object 안에서 함수 정의하기

```js
const player = {
    name = 'alex',
    sayHello: function (otherName) {
        console.log('hello', otherName)
    },
}


player.sayHello('chris')
```

함수 이름을 key값으로 정하고 function 뒤에 바로 arguement 넣기


