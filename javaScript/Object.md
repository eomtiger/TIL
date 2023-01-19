# Object



object는 파이썬 딕셔너리랑 비슷하다.



```js
const player = {
    name: 'alex',
    //'name': 'chris',
    age: 30,
    handsome: true,
    medal: ['gold', 'silver']
};
```



```js
console.log(player.name)
// alex

console.log(player['name'])
// alex
```



위의 두가지 방법으로 'alex'를 반환할 수 있는데

만약

```js
const player = {
    name: 'alex',
    'name': 'chris',
    age: 30,
    handsome: true,
    medal: ['gold', 'silver']
};
```

'name'을 추가하면 

```js
console.log(player.name)
// chris

console.log(player['name'])
// chris
```

js object는 키값이 string이든 뭐든 관계없이 적용

결국 name = 'name' 이네

object 내에서 두 번 정의하면 나중에 정의된 key: value가 찍혀서 나옴

(이론은 맞는지 모르겠지만 실험 결과는 맞다.. 그냥 'name'은 안쓰는것으로~~)


