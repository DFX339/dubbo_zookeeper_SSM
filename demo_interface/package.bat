CALL move src\test src\test_bak
CALL mvn package
CALL move src\test_bak src\test
pause