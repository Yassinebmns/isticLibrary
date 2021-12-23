$(window).on("load",function()
{
	$("#status").fadeOut(1250);
	$("#preloader").delay(500).fadeOut("slow");
});

$(function()
{
	$("#books .uk-child-width-1-6>*").on("click","img",function()
	{
		alert("kk");
	});
});