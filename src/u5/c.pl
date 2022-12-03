zug(konstanz, 08.39, offenburg, 10.59).
zug(konstanz, 08.39, karlsruhe, 11.49).
zug(konstanz, 08.53, singen, 09.26).
zug(singen, 09.37, stuttgart, 11.32).
zug(offenburg, 11.29, mannheim, 12.24).
zug(karlsruhe, 12.06, mainz, 13.47).
zug(stuttgart, 11.51, mannheim, 12.28).
zug(mannheim, 12.39, mainz, 13.18).

verbindung(Start,Uhr,Ziel) :-
    zug(Start,Uhr,Ziel,_).

verbindung(Start,Uhr,Ziel,Res) :-
    Start \= Ziel,
    zug(Start,SUhr,Neu,EndZeit),
    SUhr >= Uhr,
    verbindung(Neu,EndZeit,Ziel,Res),
    append(Res,[Start,SUhr,Neu,EndZeit],Res).
    % FIXME