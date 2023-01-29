

## [easy with assert equal](- "asserequals")
for trade [CED1](- "#extref1") I want to return amount [1978](- "?=getTradeAmount(#extref1)")

## [easy with execute](- "execute")
for trade [CED1](- "#extref2") I want to [return](- "#result=getTradeAmount(#extref2)") amount [1978](- "?=#result")



## [Table](- "table")


| [getamt][][Full Name][extref] |
|----------------------------|
|CED1|

[getamt]: - "#result = getTradeAmount(#extref3)"
[extref]: - "#extref3"
[amt]: - "?=#result"


for that table I want to check result = [1978](- "?=#result")  
for that table I want to apply again the formula using the external ref =  [1978](- "?=getTradeAmount(#extref3)")



| [blabla][][Full Name][extref4] |
|-------------------------------|
|KIM1|

[blabla]: - "#result5 = getTradeAmount(#extref4)"
[extref4]: - "#extref4"

(seems on a table you cannot just do "set". if you do (remove the blabla you get the error Nesting commands inside a 'set' is not supported))

for that table I want to apply again the formula using the external ref =  [1979](- "?=getTradeAmount(#extref4)")
