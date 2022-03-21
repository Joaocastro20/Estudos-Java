import React,{useState} from 'react';
import {Text,SafeAreaView,TouchableOpacity,StyleSheet} from 'react-native';



const App = () =>{

    const [numero, setNumero] = useState(0)

    function handleNumero(){
        const novo_numero = numero + 1
        setNumero(novo_numero)
    }

    return(
        <SafeAreaView>
            <Text style={style.titulos}>{numero}</Text>
            <TouchableOpacity onPress={handleNumero} style={style.botao}>Botão</TouchableOpacity>
        </SafeAreaView>)
}

const  style = StyleSheet.create({
    botao: {
        backgroundColor: 'red',
        alignItems: 'center',
        paddingVertical: 10 ,
        paddingHorizontal:5,
    },
    titulos: {
        backgroundColor: 'gray',
        fontSize: 26,
        color: 'white',
        fontFamily: 'cursive'
    }
})

export default App;