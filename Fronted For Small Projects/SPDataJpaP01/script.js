

const apiUrl = 'http://localhost:8080/api/std/FetchAllData';

function fetchStdAllData(){
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const userTableBody = document.querySelector('#userTable tbody');

        //Clear any existing data in the table
            userTableBody.innerHTML = '';

        //Loop through the data and create table rows
            data.forEach(user => {
                const row = document.createElement('tr');

            //create table cell for each piecee of data 

                row.innerHTML = `
                <td>${user.id} </td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
                `;
        

                user.appendChild(row);

        });
    })
    .catch(error => {
        console.error('Error Fetching data:', error);
    });
}

window.onload = fetchStdAllData;