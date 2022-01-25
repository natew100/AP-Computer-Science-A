/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pp7.pkg8;

/**
 *
 * @author Nate
 */
public interface Lockable
{
    void setKey(int key);

    void lock(int key);

    void unlock(int key);

   boolean locked();
}
