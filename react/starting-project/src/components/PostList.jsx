import { useState } from "react";
import NewPost from "./NewPost.jsx";
import Post from "./Post.jsx";
import Modal from "./Modal.jsx";
import classes from "./PostList.module.css";

function PostList({ isPosting, onStopPosting }) {
  return (
    <>
      {isPosting ? (
        <Modal onClose={onStopPosting}>
          <NewPost onCancel={onStopPosting} />
        </Modal>
      ) : null}

      <ul className={classes.posts}>
        <Post author="승디" body="asdfsdaf" />
      </ul>
    </>
  );
}

export default PostList;
