import Link from "next/link";
import { Form } from "./pages-components/login-router/Form";
import './pages-components/login-router/loginFormStyles.css'; 


export default function AppRouterSWR() {
  return (
    
      <div className="wrapper">
        <Form />
        <div className="space-y-2">
          <hr />
          
          {/* convert the following paragraphs into a ul li */}
          <ul className="list-disc list-inside">
            
          </ul>
        </div>
      </div>
    
  );
}
