import { BrowserRouter, Route, Routes } from "react-router-dom";
import Header from "./components/layout/Header";
import Footer from "./components/layout/Footer";
import Home from "./components/Home";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container } from "react-bootstrap";

const App = () => {
  return (
    <BrowserRouter>
      <Header />

      <Container>
        <Routes>
          <Route path="/" element={<Home />}/>
        </Routes>
      </Container>

      <Footer />
    </BrowserRouter>
  );
}

export default App;