package vip.yazilim.basics.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import vip.yazilim.basics.mybatis.entity.Person;

import java.util.List;

@Mapper
public interface PersonMapper {


    @Insert("INSERT INTO Person ("

            + "Name, Location, BirthDate "

            + ") VALUES ("

            + " #{name}, #{location}, #{birthDate}"

            + ")")
    @Options(useGeneratedKeys = true, keyProperty = "personId")
    int insertPerson(Person person);


    @Update("UPDATE Person SET  "

            + "Name = #{name}, "

            + "Location = #{location}, "

            + "BirthDate = #{birthDate} "

            + "WHERE PersonId = #{personId}")
    @Options(useGeneratedKeys = true, keyProperty = "personId")
    int update(Person person);


    @Delete("DELETE From Person WHERE PersonId=#{id} and name=#{name}")
    int delete(@Param("id") int id,@Param("name") String name);

    // ...
    @Select("SELECT * FROM Person")
    List<Person> findAll();

    @Select("SELECT * FROM Person WHERE PersonId=#{personId}")
    Person findById(int personId);


}
