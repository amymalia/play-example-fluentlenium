package models;
 
import play.db.ebean.Model;

/**
 * Simple model class used for form data retrieval.
 * @author Philip Johnson
 */
public class Person extends Model {
  private static final long serialVersionUID = -2206212996405933705L;
  /** The form name.*/
  public String name;
  /** The form gender.*/
  public String gender;
}
