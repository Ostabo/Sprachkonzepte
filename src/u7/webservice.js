const url = 'https://feiertage-api.de/api/';    // Variablen bekommen Typ String automatisch
const params = '?jahr=2022&nur_land=BW';
let request = url + params;                     // String-Konkatenation

function isValidRequest(url) { // Funktion matched regex
    // !! -> String Umrechnung in Boolean
    return !!url.match(/^https?:\/\/.+.(de|com|net)\/\w*\/?(\?\w+=.+(&\D+=.+)*)?$/);
}

if (isValidRequest(request)) { // Wenn request valid ist, dann fetch
    const response = fetch(request)
    response
        .then(r => r.json())
        .then(data => {
            console.log(data)
            console.log(data['Karfreitag'])     // String als Index
            request = data;                     // request bekommt anderen Typ
            console.log(request);
        });
}
