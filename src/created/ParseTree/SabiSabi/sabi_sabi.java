package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class sabi_sabi extends created.iNode
{
    public sabi_sabi(int ln)
    {
        super(ln);
    }
    
    public static class SabiSabi extends sabi_sabi
    {
        public ss_OR o;
        
        public SabiSabi(int ln, ss_OR o)
        {
            super(ln);
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(o instanceof ss_OR.ssOR)
            {
                ((ss_OR.ssOR) o).setSymList(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                ((ss_OR.ssORExpansion) o).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(o instanceof ss_OR.ssOR)
            {
                return ((ss_OR.ssOR) o).checkContext(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                return ((ss_OR.ssORExpansion) o).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
        
        public Object evaluate(SymList sl)
        {
            if(o instanceof ss_OR.ssOR)
            {
                return ((ss_OR.ssOR) o).evaluate(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                return ((ss_OR.ssORExpansion) o).evaluate(sl);
            }
            
            return null;
        }
    }
}


//sabi_sabi ::= ss_OR:o {: RESULT = new SabiSabi(o); :};