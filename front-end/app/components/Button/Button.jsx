import React from 'react';


const Button = ({ children, onClick }) => {
  const mystyle = {
      color: "white",
      backgroundColor: "DodgerBlue",
      padding: "10px",
      fontFamily: "Arial"
  };
  return (
    <div className='container'>
      <style jsx>{`
        .container {
          display: flex;
          justify-content: center;
          align-items: center;
          height: 100vh;
        }
      `}</style>
    <button onClick={onClick}>
      {children}
    </button>
    </div>
  );
};

export default Button;