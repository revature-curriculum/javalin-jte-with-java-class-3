@import objects.SeaCreature
@import java.util.*
@param ArrayList<SeaCreature> seaCreatures

<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>In my vast pen for sea creatures</p>

    @for(SeaCreature sc : seaCreatures)
    <li>
        The hunger for ${sc.getName()} is ${sc.getHungerLevel()} and 
        @if(sc.needFeed())
            they need feeding!
            ${sc.feed()}
            They are full now.
        @else
            they don't need feeding yet.
        @endif
    </li>
    @endfor


    <a href="/timeSkipSeaCreature">Fast Forward 1 hour</a>
    <br>
    <a href="/">Back</a>

</body>
</html>