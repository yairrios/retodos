/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USUARIO
 */
@Document(collection = "chocolate")

@Data

@NoArgsConstructor

@AllArgsConstructor

public class Chocolate {

@Id

private String reference;

private String category;

private String description;

private boolean availability = true;

private double price;

private int quantity;

private String photography;
}
