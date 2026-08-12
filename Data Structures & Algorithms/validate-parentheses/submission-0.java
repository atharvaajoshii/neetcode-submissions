class Solution {
    public boolean isValid(String s) {
        Tree root = null,current=null;
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                Tree nn = new Tree(ch,'\0',current);
                if(current==null){root=nn;}
                else{current.child=nn;}
                current=nn;
            }else 
            if(ch==')'||ch==']'||ch=='}'){
                if(current==null){return false;}
                if(!istrue(current.open,ch)){return false;}
                current.close=ch;
                current=current.parent;
            }
            
        }
        return current==null;
    }
    static boolean istrue(char open, char close){
        return (open=='('&& close==')') || (open=='['&& close==']') || (open=='{'&& close=='}');
    }
}
class Tree{
    char open, close;
    Tree  parent, child;
    Tree(char open, char close,Tree parent){
        this.close = close;
        this.parent = parent;
        this.open = open;
    }
}