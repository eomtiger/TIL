import { Route, Routes, Navigate } from "react-router-dom";

import About from "./pages/About";
import Home from "./pages/Home";
import Profile from "./pages/Profile";

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<Navigate to="/profiles/gildong/1/1" />} />

        <Route
          path="/profiles/:username/:nation/:duration"
          element={<Profile />}
        />
      </Routes>
    </>
  );
}

export default App;
