package ar.edu.utn.frc.tup.lc.iii.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MappersConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    } // va sa parar al apliccation context para q este disponible


    /*
   Esta anotación se utiliza para indicar inequivocamente cual es el nombre que
   tendrá un Bean. De esta manera podemos tener mas de Bean del mismo tipo en al ApplicationContext.
    */
    @Qualifier("mergerMapper") // se hace referencia a un bean por nombre cuando tengo varios del mismo tipo.
    public ModelMapper mergerMapper() {
        ModelMapper mapper =  new ModelMapper();
        mapper.getConfiguration()
                .setPropertyCondition(Conditions.isNotNull());
        return mapper;
    }
    @Bean
    public ObjectMapper objectMapper() {

ObjectMapper objectMapper = new ObjectMapper ();
objectMapper.registerModule (new JavaTimeModule ()); // interpreta el java localdatetime
        return objectMapper;
    }


}

