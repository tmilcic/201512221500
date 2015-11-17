package vvg_upup.jbpm_oms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Inventura implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long IDinventura;
   @org.kie.api.definition.type.Label("Datum")
   private java.util.Date datum;

   @org.kie.api.definition.type.Label(value = "Bar Code sredstva")
   private java.lang.String barCodeSredstva;

   @org.kie.api.definition.type.Label(value = "OIB djelatnika")
   private java.lang.String OIBdjelatnika;

   @org.kie.api.definition.type.Label(value = "Bar Cod lokacije")
   private java.lang.String barCodeLokacija;

   public Inventura()
   {
   }

   public java.lang.Long getIDinventura()
   {
      return this.IDinventura;
   }

   public void setIDinventura(java.lang.Long IDinventura)
   {
      this.IDinventura = IDinventura;
   }

   public java.util.Date getDatum()
   {
      return this.datum;
   }

   public void setDatum(java.util.Date datum)
   {
      this.datum = datum;
   }

   public java.lang.String getBarCodeSredstva()
   {
      return this.barCodeSredstva;
   }

   public void setBarCodeSredstva(java.lang.String barCodeSredstva)
   {
      this.barCodeSredstva = barCodeSredstva;
   }

   public java.lang.String getOIBdjelatnika()
   {
      return this.OIBdjelatnika;
   }

   public void setOIBdjelatnika(java.lang.String OIBdjelatnika)
   {
      this.OIBdjelatnika = OIBdjelatnika;
   }

   public java.lang.String getBarCodeLokacija()
   {
      return this.barCodeLokacija;
   }

   public void setBarCodeLokacija(java.lang.String barCodeLokacija)
   {
      this.barCodeLokacija = barCodeLokacija;
   }

   public Inventura(java.lang.Long IDinventura, java.util.Date datum,
         java.lang.String barCodeSredstva, java.lang.String OIBdjelatnika,
         java.lang.String barCodeLokacija)
   {
      this.IDinventura = IDinventura;
      this.datum = datum;
      this.barCodeSredstva = barCodeSredstva;
      this.OIBdjelatnika = OIBdjelatnika;
      this.barCodeLokacija = barCodeLokacija;
   }

}