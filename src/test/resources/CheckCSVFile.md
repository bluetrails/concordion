


[po](- "#col1name")
[cp](- "#col2name")
[transactionid](- "#col3name")
[tradereport.csv](- "#filename")
[status](- "#statuscol")

for [CEDRIC](- "#col1value") [MARTIN](- "#col2value") [123](- "#col3value") I want the report to return following columns:  

[status](- "#matchcolumn") = [VERIFIED](- "?=getCellValueBy3Col(#filename,#col1name,#col1value,#col2name,#col2value,#col3name,#col3value,#matchcolumn)")  
[amount](- "#matchcolumn") = [500](- "?=getCellValueBy3Col(#filename,#col1name,#col1value,#col2name,#col2value,#col3name,#col3value,#matchcolumn)")  
[ccy](- "#matchcolumn") = [EUR](- "?=getCellValueBy3Col(#filename,#col1name,#col1value,#col2name,#col2value,#col3name,#col3value,#matchcolumn)")  


easy:

for trade [CED1](- "#extref") I want to [return](- "#result=getTradeAmount(#extref)") amount [500](- "?=#result")


now presenting the same from a table and using it outside


now presenting the same from a working table and using it outside

now doing it for 2 trades, the long way


| [getamt][][Full Name][extref] | [First Name][amt] |
|----------------------------|-----------------|
|CED1|500|
|KIM1|300|

[getamt]: - "#result = getTradeAmount(#extref)"
[extref]: - "#extref"
[amt]: - "?=#result"


now doing it for 2 trades, the short way

