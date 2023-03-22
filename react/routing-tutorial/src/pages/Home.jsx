import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <h1>홈</h1>
      <p>가장 먼저 보여지는 페이지입니다.</p>
      <Link to="/about">소개</Link>
      <li>
        <Link to="/profiles/velopert/nation/2302-2302">velopert의 프로필</Link>
      </li>
      <li>
        <Link to="/profiles/gildong/nation/2302-2302">gildong의 프로필</Link>
      </li>
      <li>
        <Link to="/profiles/void/nation/2302-2302">존재하지 않는 프로필</Link>
      </li>
    </div>
  );
};
export default Home;
