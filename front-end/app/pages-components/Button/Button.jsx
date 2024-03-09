import React from 'react';


const Button = ({ children, onClick }) => {
  // const mystyle = {
  //     color: "white",
  //     backgroundColor: "DodgerBlue",
  //     padding: "1px",
  //     fontFamily: "Arial"
  
  return (
    <div className='container'>
      {/* <style jsx>{`
        .container {
          display: flex;
          justify-content: middle;
          align-items: middle;
          height: 12vh;
        }
      `}</style> */}
      
    <button onClick={onClick}>
      {children}
    </button>
    </div>
  );
};

export default Button;