{"changed":true,"filter":false,"title":"utos_makeKuha.java","tooltip":"/src/created/ParseTree/Utos/utos_makeKuha.java","value":"abstract class utos_makeKuha implements iNode \n{\n    public static class makeKuha extends utos_makeKuha\n    {\n        public valid_var vv; \n        public arte_assign a;\n        \n        public makeKuha(valid_var vv, arte_assign a)\n        {\n            this.vv = vv;\n            this.a = a;\n        }\n        \n        public String toString()\n        {\n            return vv.toString() + \" \" + a.toString();\n        }\n    }\n}","undoManager":{"mark":-1,"position":0,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":15,"column":30},"end":{"row":15,"column":32}},"text":"()"}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":15,"column":32},"end":{"row":15,"column":32},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416047795678}