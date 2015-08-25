<xsl:stylesheet version="1.0"

xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output

method="html" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"

doctype-system="http://www.w3.org/TR/html4/loose.dtd"

/>

<xsl:template match="@*"<xsl:attribute name="{name()}" <xsl:value-of select="." /</xsl:attribute>

</xsl:template>

<xsl:template match="*"

<xsl:element name="{name()}"<xsl:apply-templates select="@* | node()" /</xsl:element

</xsl:template<xsl:template match="comment()"<xsl:copy /</xsl:template>

</xsl:stylesheet>