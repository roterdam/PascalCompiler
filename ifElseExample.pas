program ifElseExample ;
var a_a : integer;
var b : integer;
var c : boolean;
begin
a_a := 3;
b := 23;
c := true;
while true do begin
if ((a_a < 5 or a_a = 3) and (b > 20)) then
if (not (b = 2)) then b := 5 else a_a:=8;
writeln(a_a);
end
end. 

