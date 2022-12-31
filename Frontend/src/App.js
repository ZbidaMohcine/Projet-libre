import Topbar from "./components/topbar/Topbar";
import "./App.css";
import Home from "./components/home/Home";
import Layout from "./Layout";
import Error404 from "./components/Error404/Error404";
import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";
import DirecSidebar from "./components/sidebar/DirecSidebar";
import Pagestudent from "./components/PageStudent/pagestudent"
import LoginPage from "./components/Login/LoginPage";

function App() {
  const user = false;
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="Error404" element={<Error404 />} />

          <Route exact path="/" element={<>
            <Topbar />
            <div className="container">
              <DirecSidebar />
              <Home />
            </div>
          </>}
          />
          <Route exact path="/student" element={<>
            <Topbar />
            <div className="container">
              <DirecSidebar />
              <LoginPage />
            </div>
          </>}
          />

        </Route>
        {/* </Route> */}
      </Routes>
    </BrowserRouter>
  );
}

export default App;
