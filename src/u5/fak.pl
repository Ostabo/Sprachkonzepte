fak(0, 1).
fak(N, F):-
    N > 0,
    N1 is N - 1,
    fak(N1, F1),
    F is N * F1.