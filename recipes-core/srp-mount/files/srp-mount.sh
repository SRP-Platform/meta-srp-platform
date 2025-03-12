#!/bin/bash
mountpoint -q /persistence || mount /dev/mmcblk0p3 /persistence 
mountpoint -q /logs || mount /dev/mmcblk0p4 /logs
chgrp -R persistence /persistence
chgrp -R logs /logs
chgrp -R com /run
chmod 775 /run