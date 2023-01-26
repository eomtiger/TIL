# JS on the browser



js는 html element에 접근 가능한 유일한? 언어이고 매우 유용하다



## queryselector

```html
<body>
    <div class = 'hi'>
        <h1>hello</h1>
    </div>
</body>
```

위의 html에서 div 안에 있는 h1 tag를 선택하고 싶을 때

```js
const a = document.querySelector('.hi h1')
```

위의 js 문법을 이용해 h1 객체를 만들 수 있다.



## innerText

위에서 h1 태그 안의 innerText는 hello인데

js 에서

```js
const a = document.querySelector('.hi h1')

a.innerText = 'bye'
```

innerText를 bye로 바꾸면 hello 대신 bye가 브라우저에 나타남
