const menuToggle = document.getElementById('menu-toggle');
const sidebar = document.getElementById('sidebar');
const submenuToggles = document.querySelectorAll('.submenu-toggle');

// Mostrar/ocultar o menu lateral
menuToggle.addEventListener('click', () => {
	sidebar.classList.toggle('show');
});

// Expandir/ocultar submenus
submenuToggles.forEach((toggle) => {
	toggle.addEventListener('click', (e) => {
		const submenu = e.target.nextElementSibling;
		submenu.style.display = submenu.style.display === 'block' ? 'none' : 'block';
	});
});

function atualizarRelogio() {
	const elementoHora = document.getElementById('hora');
	const periodo = document.getElementById('periodo');
	const agora = new Date();

	// Obtém as horas, minutos e segundos formatados
	const horas = agora.getHours(); // Mantém como número para comparações
	const minutos = String(agora.getMinutes()).padStart(2, '0');
	const segundos = String(agora.getSeconds()).padStart(2, '0');

	// Formata o horário no formato HH:MM:SS
	const horaAtual = `${String(horas).padStart(2, '0')}:${minutos}:${segundos}`;

	// Define o período com base na hora
	if (horas >= 12 && horas < 17) {
		periodo.textContent = 'Boa Tarde';
	} else if (horas >= 17 || horas < 4) {
		periodo.textContent = 'Boa Noite';
	} else if (horas >= 4 && horas < 12) {
		periodo.textContent = 'Bom Dia';
	} else {
		periodo.textContent = 'Vai Dormir';
	}

	// Atualiza o texto do parágrafo com o horário
	elementoHora.textContent = horaAtual;
}

// Atualiza o relógio a cada segundo
setInterval(atualizarRelogio, 1000);


atualizarRelogio();







