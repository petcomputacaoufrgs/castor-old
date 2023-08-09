cmake_minimum_required(VERSION 3.0.0)
project(LAB_FCG VERSION 0.1.0)

set(CMAKE_CXX_STANDARD 11)

SET( CMAKE_RUNTIME_OUTPUT_DIRECTORY_DEBUG "${PROJECT_SOURCE_DIR}/bin/Debug")
SET( CMAKE_RUNTIME_OUTPUT_DIRECTORY_RELEASE "${PROJECT_SOURCE_DIR}/bin/Release")

include_directories(BEFORE SYSTEM ${PROJECT_SOURCE_DIR}/include)

# Arquivos fonte c/c++
# Comente ou remova as linhas contendo os arquivos que não fazem parte desse laboratório
set(SOURCES
    src/main.cpp # Todos labs
    src/main-binary.cpp # Lab 1
    src/main-fan.cpp # Lab 1
    src/main-strip.cpp # Lab 1
    src/glad.c # Todos labs
    src/textrendering.cpp # Lab 2, 3, 4, 5
    src/tiny_obj_loader.cpp # Lab 4, 5
)

# Verifica se os arquivos fonte estão todos presentes
# Senão, avisa sobre CMakeLists mal configurado
foreach(source_file IN LISTS SOURCES)
    if(NOT EXISTS ${PROJECT_SOURCE_DIR}/${source_file})
        message(FATAL_ERROR "O arquivo ${PROJECT_SOURCE_DIR}/${source_file} não está em /src. Por favor, atualize o CMakeLists.")
        break()
    endif()
endforeach()

set(EXECUTABLE_NAME main)

add_executable(${EXECUTABLE_NAME} ${SOURCES})

find_package(OpenGL REQUIRED)

file(GLOB LIBS ${PROJECT_SOURCE_DIR}/lib-mingw-32/*)
target_link_libraries(${EXECUTABLE_NAME} ${LIBS})

