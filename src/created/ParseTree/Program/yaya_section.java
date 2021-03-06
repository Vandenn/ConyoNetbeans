package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class yaya_section extends created.iNode 
{
    public yaya_section(int ln)
    {
        super(ln);
    }
    
    public static class yayaSection extends yaya_section
    {
        public yaya_list l;
        
        public yayaSection(int ln)
        {
            super(ln);
            this.l = null;
        }
        
        public yayaSection(int ln, yaya_list l)
        {
            super(ln);
            this.l = l;
        }
        
        public String toString()
        {
            if(l != null)
                return l.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).setSymList(sl);
            }
        }
            
        public void checkContext(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
        }
        
        public void evaluate(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).evaluate(sl);
            }
        }
    }
    
}