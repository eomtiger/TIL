import React from "react";
import { useParams } from "react-router-dom";
const data = {
  velopert: {
    name: "김민준",
    description: "리액트를 좋아하는 개발자",
  },
  gildong: {
    name: "홍길동",
    description: "고전 소설 홍길동의 주인공",
  },
};
function Profile(props) {
  const params = useParams();

  const profile = data[params.username];
  console.log(params);
  return (
    <>
      <h1>사용자 프로필</h1>
      {profile ? (
        <div>
          <h2>{profile.name}</h2>
          <h2>{profile.description}</h2>
        </div>
      ) : (
        <p>존재하지 않는 프로젝트입니다</p>
      )}
    </>
  );
}

export default Profile;
