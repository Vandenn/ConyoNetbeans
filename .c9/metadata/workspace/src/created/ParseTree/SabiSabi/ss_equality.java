{"filter":false,"title":"ss_equality.java","tooltip":"/src/created/ParseTree/SabiSabi/ss_equality.java","undoManager":{"mark":100,"position":100,"stack":[[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":81,"column":38},"end":{"row":81,"column":39}},"text":"c"},{"action":"insertText","range":{"start":{"row":81,"column":38},"end":{"row":81,"column":50}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":76,"column":68},"end":{"row":76,"column":78}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":76,"column":68},"end":{"row":76,"column":69}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":76,"column":68},"end":{"row":76,"column":69}},"text":"c"},{"action":"insertText","range":{"start":{"row":76,"column":68},"end":{"row":76,"column":80}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":72,"column":59},"end":{"row":72,"column":69}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":72,"column":59},"end":{"row":72,"column":60}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":72,"column":59},"end":{"row":72,"column":60}},"text":"c"},{"action":"insertText","range":{"start":{"row":72,"column":59},"end":{"row":72,"column":71}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":123,"column":51},"end":{"row":124,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":124,"column":0},"end":{"row":124,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":12},"end":{"row":124,"column":13}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":13},"end":{"row":124,"column":14}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":14},"end":{"row":124,"column":15}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":15},"end":{"row":124,"column":16}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":16},"end":{"row":124,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":17},"end":{"row":124,"column":18}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":18},"end":{"row":124,"column":19}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":19},"end":{"row":124,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":20},"end":{"row":124,"column":21}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":21},"end":{"row":124,"column":22}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":22},"end":{"row":124,"column":23}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":23},"end":{"row":124,"column":24}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":24},"end":{"row":124,"column":25}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":124,"column":26},"end":{"row":124,"column":27}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":144,"column":8},"end":{"row":145,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":145,"column":0},"end":{"row":145,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":145,"column":8},"end":{"row":146,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":146,"column":0},"end":{"row":146,"column":8}},"text":"        "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":145,"column":8},"end":{"row":145,"column":42}},"text":"public void setSymList(SymList sl)"},{"action":"insertText","range":{"start":{"row":145,"column":42},"end":{"row":146,"column":0}},"text":"\n"},{"action":"insertLines","range":{"start":{"row":146,"column":0},"end":{"row":170,"column":0}},"lines":["        {","            if(c instanceof ss_comparison.ssComparison)","            {","                ((ss_comparison.ssComparison) c).setSymList(sl);","            }","            else if(c instanceof ss_comparison.ssComparisonExpansion)","            {","                ((ss_comparison.ssComparisonExpansion) c).setSymList(sl);","            }","            ","            if(eq instanceof equality.equal)","            {","                ((equality.equal) eq).setSymList(sl);","            }","","            if(e instanceof ss_equality.ssEquality)","            {","                ((ss_equality.ssEquality) e).setSymList(sl);","            }","            else if(e instanceof ss_OR.ssORExpansion)","            {","                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);","            }","            "]},{"action":"insertText","range":{"start":{"row":170,"column":0},"end":{"row":170,"column":9}},"text":"        }"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":168,"column":0},"end":{"row":168,"column":13}},"text":"            }"},{"action":"removeLines","range":{"start":{"row":155,"column":0},"end":{"row":168,"column":0}},"nl":"\n","lines":["            ","            if(eq instanceof equality.equal)","            {","                ((equality.equal) eq).setSymList(sl);","            }","","            if(e instanceof ss_equality.ssEquality)","            {","                ((ss_equality.ssEquality) e).setSymList(sl);","            }","            else if(e instanceof ss_OR.ssORExpansion)","            {","                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);"]},{"action":"removeText","range":{"start":{"row":154,"column":13},"end":{"row":155,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":155,"column":0},"end":{"row":155,"column":12}},"text":"            "},{"action":"removeText","range":{"start":{"row":154,"column":13},"end":{"row":155,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":159,"column":32},"end":{"row":160,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":160,"column":0},"end":{"row":160,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":160,"column":12},"end":{"row":160,"column":55}},"text":"if(c instanceof ss_comparison.ssComparison)"},{"action":"insertText","range":{"start":{"row":160,"column":55},"end":{"row":161,"column":0}},"text":"\n"},{"action":"insertLines","range":{"start":{"row":161,"column":0},"end":{"row":167,"column":0}},"lines":["            {","                ((ss_comparison.ssComparison) c).setSymList(sl);","            }","            else if(c instanceof ss_comparison.ssComparisonExpansion)","            {","                ((ss_comparison.ssComparisonExpansion) c).setSymList(sl);"]},{"action":"insertText","range":{"start":{"row":167,"column":0},"end":{"row":167,"column":13}},"text":"            }"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":16},"end":{"row":166,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":17},"end":{"row":166,"column":18}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":18},"end":{"row":166,"column":19}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":19},"end":{"row":166,"column":20}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":20},"end":{"row":166,"column":21}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":21},"end":{"row":166,"column":22}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":22},"end":{"row":166,"column":23}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":16},"end":{"row":162,"column":17}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":17},"end":{"row":162,"column":18}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":18},"end":{"row":162,"column":19}},"text":"t"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":19},"end":{"row":162,"column":20}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":20},"end":{"row":162,"column":21}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":21},"end":{"row":162,"column":22}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":162,"column":22},"end":{"row":162,"column":23}},"text":" "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":168,"column":19},"end":{"row":168,"column":36}},"text":"c.checkContext();"},{"action":"insertText","range":{"start":{"row":168,"column":19},"end":{"row":168,"column":20}},"text":":"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":168,"column":20},"end":{"row":168,"column":21}},"text":":"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":168,"column":20},"end":{"row":168,"column":21}},"text":":"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":168,"column":19},"end":{"row":168,"column":20}},"text":":"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":168,"column":19},"end":{"row":168,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":168,"column":21},"end":{"row":168,"column":22}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":162,"column":56},"end":{"row":162,"column":66}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":162,"column":56},"end":{"row":162,"column":57}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":162,"column":56},"end":{"row":162,"column":57}},"text":"c"},{"action":"insertText","range":{"start":{"row":162,"column":56},"end":{"row":162,"column":68}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":75}},"text":"setSymList"},{"action":"insertText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":66}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":66}},"text":"c"},{"action":"insertText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":66}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":66},"end":{"row":166,"column":67}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":166,"column":66},"end":{"row":166,"column":67}},"text":"c"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":166,"column":66},"end":{"row":166,"column":67}},"text":"h"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":67}},"text":"ch"},{"action":"insertText","range":{"start":{"row":166,"column":65},"end":{"row":166,"column":77}},"text":"checkContext"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":62,"column":0},"end":{"row":62,"column":12}},"text":"            "},{"action":"removeText","range":{"start":{"row":61,"column":13},"end":{"row":62,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":167,"column":20},"end":{"row":167,"column":21}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":167,"column":19},"end":{"row":167,"column":20}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":167,"column":19},"end":{"row":167,"column":20}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":167,"column":20},"end":{"row":167,"column":21}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":167,"column":21},"end":{"row":167,"column":22}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":167,"column":22},"end":{"row":167,"column":23}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":25},"end":{"row":123,"column":26}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":24},"end":{"row":123,"column":25}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":23},"end":{"row":123,"column":24}},"text":"o"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":22},"end":{"row":123,"column":23}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":21},"end":{"row":123,"column":22}},"text":"r"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":20},"end":{"row":123,"column":21}},"text":"e"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":123,"column":19},"end":{"row":123,"column":20}},"text":"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":123,"column":19},"end":{"row":123,"column":20}},"text":"n"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":123,"column":20},"end":{"row":123,"column":21}},"text":"u"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":123,"column":21},"end":{"row":123,"column":22}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":123,"column":22},"end":{"row":123,"column":23}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":93,"column":31},"end":{"row":94,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":94,"column":0},"end":{"row":94,"column":16}},"text":"                "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":94,"column":16},"end":{"row":94,"column":17}},"text":"{"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":101,"column":73},"end":{"row":102,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":102,"column":0},"end":{"row":102,"column":16}},"text":"                "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":102,"column":16},"end":{"row":102,"column":17}},"text":"}"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":95,"column":0},"end":{"row":95,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":96,"column":0},"end":{"row":96,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":97,"column":0},"end":{"row":97,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":98,"column":0},"end":{"row":98,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":99,"column":0},"end":{"row":99,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":100,"column":0},"end":{"row":100,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":101,"column":0},"end":{"row":101,"column":4}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":106,"column":29},"end":{"row":107,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":107,"column":0},"end":{"row":107,"column":16}},"text":"                "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":107,"column":16},"end":{"row":107,"column":17}},"text":"{"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":114,"column":73},"end":{"row":115,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":115,"column":0},"end":{"row":115,"column":16}},"text":"                "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":115,"column":16},"end":{"row":115,"column":17}},"text":"}"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":108,"column":0},"end":{"row":108,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":109,"column":0},"end":{"row":109,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":110,"column":0},"end":{"row":110,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":111,"column":0},"end":{"row":111,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":112,"column":0},"end":{"row":112,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":113,"column":0},"end":{"row":113,"column":4}},"text":"    "},{"action":"insertText","range":{"start":{"row":114,"column":0},"end":{"row":114,"column":4}},"text":"    "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":33,"column":63},"end":{"row":33,"column":64}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":144,"column":8},"end":{"row":144,"column":10}},"text":"/*"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":146,"column":9},"end":{"row":146,"column":11}},"text":"*/"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":160,"column":44},"end":{"row":160,"column":45}},"text":"l"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":8},"end":{"row":31,"column":9}},"text":"/"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":9},"end":{"row":31,"column":10}},"text":"*"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":36,"column":9},"end":{"row":36,"column":11}},"text":"*/"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":36,"column":10},"end":{"row":36,"column":11}},"text":"/"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":36,"column":9},"end":{"row":36,"column":10}},"text":"*"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":31,"column":9},"end":{"row":31,"column":10}},"text":"*"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":31,"column":8},"end":{"row":31,"column":9}},"text":"/"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":31,"column":8},"end":{"row":31,"column":11}},"text":"// "},{"action":"insertText","range":{"start":{"row":32,"column":8},"end":{"row":32,"column":11}},"text":"// "},{"action":"insertText","range":{"start":{"row":33,"column":8},"end":{"row":33,"column":11}},"text":"// "},{"action":"insertText","range":{"start":{"row":34,"column":8},"end":{"row":34,"column":11}},"text":"// "},{"action":"insertText","range":{"start":{"row":35,"column":8},"end":{"row":35,"column":11}},"text":"// "},{"action":"insertText","range":{"start":{"row":36,"column":8},"end":{"row":36,"column":11}},"text":"// "}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":100,"column":52},"end":{"row":100,"column":53}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":113,"column":52},"end":{"row":113,"column":53}},"text":";"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":87,"column":33},"end":{"row":87,"column":38}},"text":"ss_OR"},{"action":"insertText","range":{"start":{"row":87,"column":33},"end":{"row":87,"column":44}},"text":"ss_equality"},{"action":"removeText","range":{"start":{"row":87,"column":45},"end":{"row":87,"column":58}},"text":"ssORExpansion"},{"action":"insertText","range":{"start":{"row":87,"column":45},"end":{"row":87,"column":64}},"text":"ssEqualityExpansion"},{"action":"removeText","range":{"start":{"row":58,"column":39},"end":{"row":58,"column":52}},"text":"ssORExpansion"},{"action":"insertText","range":{"start":{"row":58,"column":39},"end":{"row":58,"column":58}},"text":"ssEqualityExpansion"},{"action":"removeText","range":{"start":{"row":58,"column":33},"end":{"row":58,"column":38}},"text":"ss_OR"},{"action":"insertText","range":{"start":{"row":58,"column":33},"end":{"row":58,"column":44}},"text":"ss_equality"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":127,"column":19},"end":{"row":127,"column":23}},"text":"null"},{"action":"insertText","range":{"start":{"row":127,"column":19},"end":{"row":127,"column":21}},"text":"\"\""}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":126,"column":51},"end":{"row":127,"column":0}},"text":"\n"},{"action":"insertText","range":{"start":{"row":127,"column":0},"end":{"row":127,"column":12}},"text":"            "}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":90,"column":0},"end":{"row":90,"column":4}},"text":"    "}]}]]},"ace":{"folds":[],"scrolltop":813.7222604751587,"scrollleft":0,"selection":{"start":{"row":90,"column":9},"end":{"row":90,"column":9},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":55,"state":"start","mode":"ace/mode/java"}},"timestamp":1416195285246,"hash":"89f081800fbfa4b28051a377c779127e60f7793a"}