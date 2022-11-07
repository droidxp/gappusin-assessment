public class com.loopj.android.http.SerializableCookie implements java.io.Serializable {
	 /* # interfaces */
	 /* # instance fields */
	 private transient org.apache.http.impl.cookie.BasicClientCookie clientCookie;
	 private transient org.apache.http.cookie.Cookie cookie;
	 /* # direct methods */
	 public com.loopj.android.http.SerializableCookie ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.cookie = p1;
		 return;
	 } // .end method
	 private void readObject ( java.io.ObjectInputStream p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Ljava/lang/ClassNotFoundException; */
		 /* } */
	 } // .end annotation
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v1, Ljava/lang/String; */
	 /* new-instance v2, Lorg/apache/http/impl/cookie/BasicClientCookie; */
	 /* invoke-direct {v2, v0, v1}, Lorg/apache/http/impl/cookie/BasicClientCookie;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 this.clientCookie = v2;
	 v1 = this.clientCookie;
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v1 ).setComment ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setComment(Ljava/lang/String;)V
	 v1 = this.clientCookie;
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v1 ).setDomain ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setDomain(Ljava/lang/String;)V
	 v1 = this.clientCookie;
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v0, Ljava/util/Date; */
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v1 ).setExpiryDate ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setExpiryDate(Ljava/util/Date;)V
	 v1 = this.clientCookie;
	 (( java.io.ObjectInputStream ) p1 ).readObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v1 ).setPath ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setPath(Ljava/lang/String;)V
	 v0 = this.clientCookie;
	 v1 = 	 (( java.io.ObjectInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setVersion ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setVersion(I)V
	 v0 = this.clientCookie;
	 v1 = 	 (( java.io.ObjectInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z
	 (( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setSecure ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setSecure(Z)V
	 return;
} // .end method
private void writeObject ( java.io.ObjectOutputStream p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeObject ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
v0 = v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V
v0 = v0 = this.cookie;
(( java.io.ObjectOutputStream ) p1 ).writeBoolean ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
return;
} // .end method
/* # virtual methods */
public org.apache.http.cookie.Cookie getCookie ( ) {
/* .locals 2 */
v0 = this.cookie;
v1 = this.clientCookie;
if ( v1 != null) { // if-eqz v1, :cond_0
	 v0 = this.clientCookie;
} // :cond_0
} // .end method
