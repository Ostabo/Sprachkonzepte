sum([], 0).
sum([H|T], R) :-
   sum(T, Rest),
   R is H + Rest.