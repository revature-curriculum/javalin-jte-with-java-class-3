@import objects.Table
@import java.util.*
@param ArrayList<Table> tables


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>In the waiter's head</p>

    @for(Table table : tables)
    <li>
        The waiter thinks: 
        The water level for table ${table.getTable()} is
        @if(table.needRefill())
            low and needs refilling!
            ${table.refill()}
            It is full now.
        @else
            fine for now.
        @endif
    </li>
    @endfor

    <a href="/">Back</a>

</body>
</html>