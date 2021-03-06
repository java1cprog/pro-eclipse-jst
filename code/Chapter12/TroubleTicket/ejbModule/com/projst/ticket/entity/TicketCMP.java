/*
 * Generated by XDoclet - Do not edit!
 */
package com.projst.ticket.entity;

/**
 * CMP layer for Ticket.
 * @generated 
 * @wtp generated
 */
public abstract class TicketCMP
   extends com.projst.ticket.entity.TicketBean
   implements javax.ejb.EntityBean
{

   public com.projst.ticket.entity.TicketData getData()
   {
      com.projst.ticket.entity.TicketData dataHolder = null;
      try
      {
         dataHolder = new com.projst.ticket.entity.TicketData();

         dataHolder.setId( getId() );
         dataHolder.setSummary( getSummary() );
         dataHolder.setDetail( getDetail() );
         dataHolder.setEmail( getEmail() );
         dataHolder.setSubmitted( getSubmitted() );
         dataHolder.setLastModified( getLastModified() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void setData( com.projst.ticket.entity.TicketData dataHolder )
   {
      try
      {
         setSummary( dataHolder.getSummary() );
         setDetail( dataHolder.getDetail() );
         setEmail( dataHolder.getEmail() );
         setSubmitted( dataHolder.getSubmitted() );
         setLastModified( dataHolder.getLastModified() );

      }
      catch (Exception e)
      {
         throw new javax.ejb.EJBException(e);
      }
   }

   /**
    * Generated ejbPostCreate for corresponding ejbCreate method.
    *
    * @see #ejbCreate(java.lang.String summary,java.lang.String email)
    */
   public void ejbPostCreate(java.lang.String summary,java.lang.String email)
   {
   }

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {

   }

 /* Value Objects BEGIN */

/* Value Objects END */

   public abstract java.lang.Integer getId() ;

   public abstract void setId( java.lang.Integer id ) ;

   public abstract java.lang.String getSummary() ;

   public abstract void setSummary( java.lang.String summary ) ;

   public abstract java.lang.String getDetail() ;

   public abstract void setDetail( java.lang.String detail ) ;

   public abstract java.lang.String getEmail() ;

   public abstract void setEmail( java.lang.String email ) ;

   public abstract java.sql.Timestamp getSubmitted() ;

   public abstract void setSubmitted( java.sql.Timestamp submitted ) ;

   public abstract java.sql.Timestamp getLastModified() ;

   public abstract void setLastModified( java.sql.Timestamp lastModified ) ;

}
