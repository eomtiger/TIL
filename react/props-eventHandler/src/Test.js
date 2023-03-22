import React from "react";

const Test = ({ aHandler }) => {
  return (
    <>
      <button
        onClick={() => {
          aHandler(1);
        }}
      >
        1로되는버튼
      </button>
      <div>
        <button
          onClick={() => {
            aHandler(0);
          }}
        >
          0으로되는버튼
        </button>
      </div>
    </>
  );
};

export default Test;
