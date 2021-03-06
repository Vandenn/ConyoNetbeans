package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ref_brackets extends created.iNode 
{
    public ref_brackets(int ln)
    {
        super(ln);
    }
    
    public static class refBrackets extends ref_brackets
    {
        public sabi_sabi s; 
        
        public refBrackets(int ln, sabi_sabi s)
        {
            super(ln);
            this.s = s;
        }
        
        public String toString()
        {
            return "[" + s.toString() + "]";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            String type = "";
            if(s instanceof sabi_sabi.SabiSabi)
            {
                type = ((sabi_sabi.SabiSabi) s).checkContext(sl);
                System.out.println(type);
                if(!type.equals("inty"))
                {
                    ErrorReport.error(ln(), "Index used for array is not an integer.: " + ((sabi_sabi.SabiSabi) s).toString());
                }
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
            }
        }
        
    }
}