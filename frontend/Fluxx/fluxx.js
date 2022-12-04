// cards
let baraja = [{
        "tipo": "goal",
        "titulo": "dreamer",
        "descripcion": ""
    },
    {
        "tipo": "goal",
        "titulo": "cosmos",
        "descripcion": ""
    },
    {
        "tipo": "goal",
        "titulo": "rocket",
        "descripcion": ""
    },
    {
        "tipo": "keeper",
        "titulo": "money",
        "descripcion": ""
    },
    {
        "tipo": "keeper",
        "titulo": "bread",
        "descripcion": ""
    },
    {
        "tipo": "keeper",
        "titulo": "toster",
        "descripcion": ""
    },
    {
        "tipo": "kreper",
        "titulo": "rip",
        "descripcion": ""
    },
    {
        "tipo": "kreper",
        "titulo": "potato",
        "descripcion": ""
    },
    {
        "tipo": "kreper",
        "titulo": "death",
        "descripcion": ""
    },
    {
        "tipo": "action",
        "titulo": "fall",
        "descripcion": ""
    },
    {
        "tipo": "action",
        "titulo": "draw 3",
        "descripcion": ""
    },
    {
        "tipo": "action",
        "titulo": "play 3",
        "descripcion": ""
    },
    {
        "tipo": "rule",
        "titulo": "inflation",
        "descripcion": ""
    },
    {
        "tipo": "rule",
        "titulo": "win with potato",
        "descripcion": ""
    },
    {
        "tipo": "rule",
        "titulo": "reset",
        "descripcion": ""
    }
]

// *json con la configuracion inicial 
let nplayers = 3;
// board
const board = {
    turno: 0,
    baraja: baraja,
    cementerio: [],
    rules: {
        draw: 1,
        play: 1,
        rules: {}
    },
    action: null,
    goals: []
};

//run
// 1. verificar jugadores
if (nplayers > 1 && nplayers<7){
    Game()
}
else{
    console.log("numero de jugadores invalido (2-6)");
}

function repartir() {
    let players = [];
    for (var i = 0; i < nplayers; i++) {
        players[i] = {
            hand: [],
            table: {
                keeper: [],
                kreper: []
            }
        };
        let temp = [];
        for (var j = 0; j < 3; j++) {
            temp.push(baraja.pop());
        }
        console.log(temp);
        players[i].hand = temp;
    }
    players.forEach(Element => console.log(Element));
    return players;
}

function play(players){
    let winner = undefined;
    let win = false;
    while (!win) {
        players.forEach(function(player){
           //draw
            
           //play

           
        });
    }

    return winner;
}

function Game(){
    //board.baraja  = barajar(Baraja);
    let players = repartir();
    let winner = undefined;
    while (!winner) {
    winner = play(players);
    }
    console.log("ganador: " + winner);
}




