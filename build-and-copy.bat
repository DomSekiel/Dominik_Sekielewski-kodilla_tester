echo Usuwanie Strych plikow jar

IF EXIST build\libs\*.jar del build\libs\*.jar

echo Uruchamianie Gradle'a

call gradlew build

IF EXIST build\libs\*.jar (
	IF NOT EXIST C:\project mkdir C:\project
	copy build\libs\*.jar C:\project
	echo Plik JAR zostal skopiowany do katalogu C:\project
) ELSE (
	echo Blad kompilacji - plik jar nie zostal utworzony
)
	